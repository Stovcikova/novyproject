package sk.kosickaakademia.stovcikova.novyproject;

public class Table {
    private int[][] arr= new int[][]{ {2,5,-5,0}, {8,1,7,9}, {9,1,8,14}};
    private static int[][] poleXX = new int[][]{{2,5,4,0}, {8,1,7,9}, {9,1,8,14}};

    public static void main(String[] args) {

        Table t = new Table();
        int value = t.min();
        System.out.println("Min value is "+value);

        Table.transponovana();  //volanie funkcie
    }
    public int min(){
        int minimum=arr[0][0];
        int i,j;
        for (i=0;i< arr.length;i++){
            for (j=0;j<arr[0].length;j++) {
                if (arr[i][j]<minimum) {
                    minimum=arr[i][j];
                }

            }
        }
        return minimum;
    }

    public static void transponovana() {

        int riadky= poleXX.length;
        int stlpce= poleXX[0].length;
        int [][]tmatica= new int[stlpce][riadky];
        for (int i=0;i<riadky;i++){    //vytvoria transponovanu maticu
            for (int j=0;j<stlpce;j++){
                tmatica[j][i]=poleXX[i][j];

            }

        }
        for (int i=0;i<tmatica.length;i++){     //vypisu transponovanu maticu
            for (int j=0;j<tmatica[0].length;j++){
                System.out.print(tmatica[i][j]);
            }
            System.out.println();
        }

    }
}
