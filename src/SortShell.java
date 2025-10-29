public class SortShell {

    public SortShell() {
        System.out.println("Metodo Shell");
    }
    public void sort(int[] numeros, boolean ase){
        int n= numeros.length;
        int comparacion=0;
        int cambios =0;
        for(int gap = n/2;gap>0;gap/=2){
            for(int i=gap;i<n;i++){
                int temp = numeros[i];
                int j =i;
                while (j >= gap) {
                    comparacion++;
                    if (numeros[j - gap] > temp) {
                        numeros[j] = numeros[j - gap];
                        cambios++;
                        j -= gap;
                                           
                    }else{
                        break;
                    }   
                    
                    
                }  
                numeros[j] = temp;
               
            }

        }
        int total= comparacion + cambios;
        System.out.println("\n ( Comparacion + cambios =) " + total);

    }
    
}
