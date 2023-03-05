public class Array {
    public static void main(String[] args) {
        /* int[] marks = new int[8];
        marks[0]= 44;
        marks[1]= 47;
        marks[2]= 33;
        marks[3]= 63;
        marks[4]= 85;
        marks[5]= 76;
        marks[6]= 58;
        marks[7]= 91;
        */
        int[] marks = {33,44,55,66,77,88};

        //using for loop
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        //using for-each loop
        for(int elements: marks){
            System.out.println(elements);
        }


    }
}
