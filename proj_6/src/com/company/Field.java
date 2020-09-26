package com.company;
import java.util.Arrays;
import java.util.stream.Stream;

public class Field {
        private int arr[][];
        private int dop_arr[][];
        private int n;

        public Field(int n) {
            this.n = n;
            arr = new int[n][n];
            dop_arr = new int[n][n];
        }

        public void Filling() {
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    arr[i][j] = -10 + (int) (Math.random() * 100);
                }
            dop_arr[0][0] = arr[0][0];
        }

        public void Output() {
            System.out.println("Field:");
            Stream.of(arr).map(Arrays::toString).forEach(System.out::println);
        }

        public int searchResult() {

            for (int i = 1; i < n; i++) {
                dop_arr[i][0] = arr[i][0] + dop_arr[i - 1][0];
            }

            for (int j = 1; j < n; j++) {
                dop_arr[0][j] = arr[0][j] + dop_arr[0][j - 1];
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    dop_arr[i][j] = Math.max(dop_arr[i - 1][j], dop_arr[i][j - 1]) + arr[i][j];
                }
            }
            return dop_arr[n - 1][n - 1];
        }
    }

