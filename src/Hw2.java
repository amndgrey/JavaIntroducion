public class Hw2 {

/*Задать целочисленный=int массив, состоящий из элементов 0 и 1.
*Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
*С помощью цикла for и условия заменить 0 на 1, 1 на 0
*/
    public static class Array {

        public static void main(String[] args) {

            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
            int arrll = arr.length;
            for (int i = 0; i < arrll; i++) {
                if (arr[i] == 1) arr[i] = 0;
                else arr[i] = 1;
            }
            System.out.println("Task 1:");
            for (int i = 0; i < arrll; i++) {
                System.out.println(i + "-" + arr[i]);
            }

 /*
*Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
 */

            int[] array = new int[8];
            int j = 0;
            int fill = array.length;
            System.out.println(" ");
            System.out.println("Task 2:");

            for (int i = 0; i < fill; ++i, j = j + 3) {
                array[i] = j;
                System.out.print(+array[i] + " ");
                System.out.println(" ");
            }

 /*
Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2.
*/
            int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int arr3 = array3.length;
            for (int i = 0; i < arr3; i++) {
                if (array3[i] < 6)
                    array3[i] = array3[i] * 2;
            }
            System.out.println(" ");
            System.out.print("Task 3:  ");

            for (int i = 0; i < arr3; i++) {

                System.out.print(+array3[i] + ", ");

            }
            /*
*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
*и с помощью цикла(-ов) заполнить его диагональные элементы единицами
*/
/*int [i][j] - индексы ij; i-rows, j-column (ряд, столбец)

двухмерный массив default:
 0i 0j
 1i 0j
*/

// инициация двухмерного, квадратного массива
            int[][] sqArr = new int[2][2]; // default прописанные в Java {{0, 0}, {1, 0}};
//переносим результат вывода на строку ниже от задания 3 (для читаемости результата)
            System.out.println("");
            System.out.println("Task 4:");
            //для значения по индексу i, если значение равно нулю но меньше 2, сделать инкремент(т.е приращение на +1)
            for (int i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
/*
"проходим" по каждому значению в массиве и если заданные нами условия исполнены
то значение не меняется, если нет, то меняется на 1
  */
                    if (i < j) {
                        sqArr[i][j] = 0;
                    } else if (i > j) {
                        sqArr[i][j] = 1;
                    } else {
                        sqArr[i][j] = 1;
                    }
                    System.out.print(sqArr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
