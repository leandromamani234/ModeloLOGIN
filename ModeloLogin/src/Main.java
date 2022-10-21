public class Main {
    public static void main(String[] args) {
       Estudiante cristian= new Estudiante("leandro","mamani","Alanis","13994274","17-04-2003","Av Petrolera",77971417,77,"leandromamani@gimail.com","leandromamni234","77971417","1399");
       Docente javier= new Docente("Javier","Sander","","1454","17-08-1999","Sacaba",66997414,45,"sandercito@gmail.com","javiercito17","javierporcienmpre",2200);
       Persona[] personas = {cristian,javier};
       Usuario[] usuarios= {cristian,javier};
       Persona persona1= cristian;
       Persona persona2 = javier;
       Usuario usuario1= cristian;
       Usuario usuario2= javier;
       Estudiante estudiante1=(Estudiante)persona1;
       Docente docente1= (Docente) persona2;

    }

}