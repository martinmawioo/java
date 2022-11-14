public class ArraySize {
            private int arr[];

        public int[] getArr() {
            return arr;
        }

        public void setArr(int[] arr) {
            this.arr = arr;
        }

        /**
         * Retuns -1 if serchKey is not found.
         * If serchKey is found in array it returns
         * the index value
         *
         * @param arr
         * @param seachKey
         * @return
         */
        static int findElement(int arr[], int seachKey) {
            if (arr == null || arr.length == 0) {
                return -1;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == seachKey) {
                    return i;

                }
            }
            return -1;
        }

        public static void main(String[] args) {
            ArraySize result = new ArraySize();
            int[] inpurArr = { 1, 2, 5, 4, 3 };
            result.setArr(inpurArr);
            System.out.println(ArraySize.findElement(result.getArr(), 3));
        }

    }

