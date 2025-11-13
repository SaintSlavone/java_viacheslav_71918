

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int counter = 0;
    boolean isSorted = false;

    System.out.println(Arrays.toString(array));

    for(int i = array.length - 1; i > 0; i--) {
        for(int j = 0; j < i && !isSorted; j++) {

            if(array[j] > array[j+1]) {
                int greater = array[j];
                array[j] = array[j+1];
                array[j+1] = greater;
                counter ++;
            }else {
                isSorted = true;
            }
            counter ++;
        }
        counter ++;
    }
    System.out.println(counter);
    System.out.println(Arrays.toString(array));
}
