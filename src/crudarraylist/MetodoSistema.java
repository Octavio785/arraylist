package crudarraylist;

import java.util.*;

import crudarraylist.DatosPersona;

public class MetodoSistema {
    
    List<DatosPersona> list= new ArrayList<>();
    int Id=0;    
    ;
    
    
    public void registrarPersona(DatosPersona p){
        Id=Id+1;
        p.setId(Id);
        list.add(p);
    }
    
    public List<DatosPersona> list(){  //read
        return list;
    }
    
    public void delete(int id) throws Exception{
      
        for(DatosPersona ps : list){
            if(Id == ps.getId()){
               System.out.print("Eliminando"+ps.getNombres());
               list.remove(ps);
               
            }
        }           
        
        Iterator<DatosPersona> itr = list.iterator();            
        while(itr.hasNext()){
            DatosPersona pers = itr.next();
            if(pers.getId()==(Id)){
                System.out.println("Eliminando a: "+pers.getNombres());
                itr.remove();                    
            }
        }
            
            
    }
        
    
}
