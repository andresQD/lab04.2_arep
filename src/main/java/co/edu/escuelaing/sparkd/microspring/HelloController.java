package co.edu.escuelaing.sparkd.microspring;

public class HelloController {

    @RequestMapping("/hola")
    static public String hola() {
        return "Greetings from Micro Spring Boot!";
    }

    @RequestMapping("/pi")
    static public String pi() {
        return "PI: " + Math.PI;
    }

    @RequestMapping("/pag")
    static public String pagina() {
        String outputLine = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n" 
                + "<meta charset=\"UTF - 8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Constante de Euler</h1>\n" + Math.E
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }
    
    @RequestMapping("/mongo")
    static public String info() {
        Mongo cm = new Mongo();
        String outputLine = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n" 
                + "<meta charset=\"UTF - 8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Constante de Euler</h1>\n" + cm.info()
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }
}
