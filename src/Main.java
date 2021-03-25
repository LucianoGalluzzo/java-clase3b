public class Main {

    public static void main(String[] args) {

        Persona[] arr = new Persona[7];
        arr[0] = new Persona("Luciano", 39923347);
        arr[1] = new Persona("Juan", 40938493);
        arr[2] = new Persona("Federico", 38294839);
        arr[3] = new Persona("Martina", 41028492);
        arr[4] = new Persona("Joana", 41929483);
        arr[5] = new Persona("Jorge", 20394829);
        arr[6] = new Persona("Melina", 38273849);

        SortUtil.ordenar(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getDni());
        }

        Celular[] arr2 = new Celular[7];
        arr2[0] = new Celular(1146573831, "Juan");
        arr2[1] = new Celular(1136573831, "Federico");
        arr2[2] = new Celular(1126573831, "Melina");
        arr2[3] = new Celular(1147573831, "Martina");
        arr2[4] = new Celular(1129573831, "Joana");
        arr2[5] = new Celular(1131573831, "Luciano");
        arr2[6] = new Celular(1166573831, "Jorge");

        SortUtil.ordenar(arr2);

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i].getNumero());
        }

    }
}
