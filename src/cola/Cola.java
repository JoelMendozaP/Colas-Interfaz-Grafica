package cola;

/**
 *
 * @author joelm
 */
public class Cola {
    Usuario cola[]= new Usuario[9];
    int bola = 0;
    int cont = 1;
    
    public void Push(String nombre,int edad){
        
        if(bola<9){
            cola[bola]=new Usuario(nombre, edad);
            bola++;
            cont++;
        }
    }
    public int getContador(){
        return cont;
    } 
    
    public String getColaN(int x){
        return ""+cola[x-1].getNombre();
    }
    public int getColaE(int x){
        return cola[x-1].getEdad();
    }
    
    public Usuario Pop(){
        Usuario r=null;
        if(bola>0){
            //cola[0].setNombre(null);
            //cola[0].setEdad(0);
            r=cola[0];
            cola[0]=null;
            for(int i=1;i<bola;i++){
                cola[i-1]=cola[i];
                //cola[i-1].setNombre(cola[i].getNombre());
                //cola[i-1].setEdad(cola[i].getEdad());
            }
            bola--;
        }
        return r;
    }
    
    public String VerCola(){
        String v="";
        if(bola==0){ 
            v="No hay elementos";
        }else{
            for(int i=0;i<bola;i++){
                v+=("Usuario "+(i+1)+": "+cola[i].getNombre()+" -> Edad: "+cola[i].getEdad()+"\n");
            }
        }
        return v;    
    }
    
    public int Elementos(){
        int elementos=0;
        elementos=bola;
        return elementos;
    }
    
    public String EstaLlena(){
        String llena="";
        if(bola == 9){
            llena = "Llena";
        }else{
            llena = "No esta llena";
        }
        return llena;
    }
    
    public String EstaVacia(){
        String vacia="";
        if(bola == 0){
            vacia = "Vacia";
        }else{
            vacia = "No esta Vacia";
        }
        return vacia;
    }
    
    public String Primero(){
        String pri="";
        if(cola[0] != null){
            pri = ""+cola[0].getNombre();
        }else{
            pri = "No hay cola";
        }
        return pri;
    }
    
    public String Ultimo(){
        String ul="";
        if(cola[0] != null){
            ul = "ultimo: "+cola[bola-1].getNombre();
        }else{
            ul = "No hay cola";
        }
        return ul;
    }
    
    public void VaciarCola(){
        if(bola>0){
            for(int i=bola-1;i>=0;i--){
            cola[i]=null;
            }
        bola=0;
        }
    }
}