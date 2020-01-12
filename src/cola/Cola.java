package cola;

public class Cola {
    Object cola[]= new Object[9];
    int bola = 0;
    int cont = 1;
    
    public void Push(String x){
        if(bola<9){
            cola[bola]=x;
            bola++;
            cont++;
        }
    }
    public int getContador(){
        return cont;
    } 
    
    public String getElemento(int x){
        return ""+cola[x-1];
    }
    
    public void Pop(){
        if(bola>0){
            cola[0]=null;
            for(int i=1;i<bola;i++){
                cola[i-1]=cola[i];
            }
            bola--;
        }
    }
    
    public String VerCola(){
        String v="";
        if(bola==0){ 
            v="No hay elementos";
        }else{
            for(int i=0;i<bola;i++){
                v+=("Elemnto: "+(i+1)+" "+cola[i]+"\n");
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
            pri = ""+cola[0];
        }else{
            pri = "No hay cola";
        }
        return pri;
    }
    
    public String Ultimo(){
        String ul="";
        if(cola[0] != null){
            ul = "ultimo: "+cola[bola-1];
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