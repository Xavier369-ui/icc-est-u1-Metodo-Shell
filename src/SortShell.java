public class SortShell {

    public SortShell() {
        System.out.println("Metodo Shell");
    }
    public void sort(int[] numeros, boolean ase){
        int n= numeros.length;
        int comparacion=0;
        for(int gap = n/2;gap>0;gap/=2){
            int cambios =0;
            for(int i=gap;i<n;i++){
                int temp = numeros[i];
                int j =i;
                while(j>=gap && numeros[j-gap]> temp){
                    comparacion++;
                    numeros[j]=numeros[j-gap];
                    j-=gap;
                    cambios++;
                }
                numeros[j]=temp;
            }

        }
        int total = comparacion ;
        System.out.println("\nNumero de comparaciones: " + total);

    }
    
}
