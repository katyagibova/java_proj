package proj_21_22;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import java.io.*;

public class File  implements ItemsStore{
    Gson gson = new Gson();
    private File file = new File("D:\\Repositories\\java_proj\\Java_project\\src\\main\\java\\proj_21_22\\data.json");

    final String path = "src\\main\\java\\proj_21_22\\data.json";
    public File(String s) {
    }


    @Override
    public List<Item> getAll() throws IOException, InterruptedException {
        String text, fullText = "";
        ArrayList<Item> items = new ArrayList<>();
        Type collectionType = new TypeToken<Collection<Item>>() {
        }.getType();
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(file)))) {
            text = reader.readLine();
            while (text != null) {
                fullText += text + "\n";
                text = reader.readLine();
            }
            items = gson.fromJson(fullText, collectionType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public Item get(int id) throws IOException, InterruptedException{
        List<Item> items = getAll();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                return items.get(i);
            }
        }
        return null;
    }

    @Override
    public Item addItem(Item item) throws IOException, InterruptedException{
        try
        {
            FileWriter writer = new FileWriter(String.valueOf(file), true);
            if(item.getId() != 1) {
                writer.write(",");
            }
            writer.write("\n"+gson.toJson(item).replace(",", ",\n    ").replace("{", "{\n    ").replace("}", "\n}"));
            writer.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public Item editItem(int id, Item item) throws IOException, InterruptedException {
        deleteItem(id);
        addItem(item);
        return item;
    }

    @Override
    public void deleteItem(int id) throws IOException, InterruptedException {
        List<Item> items = getAll();
        items.removeIf(i -> i.getId() == id);
        sort(items);
        FileWriter write = new FileWriter(path);
        write.write("[\n");
        for (Item i:items) {
            write.write(gson.toJson(i));
            if(items.indexOf(i)!=items.size()-1) write.write(",");
            write.write("\n");
        }
        write.write("\n]");
        write.close();
    }

    private void sort(List<Item> items){
        items.sort((o1, o2) -> (int) Math.signum(o1.getId()-o2.getId()));
    }
}