import movie.modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {
    public static void interfazUsuario() {
        ICatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
        Pelicula pelicula;
        CERRAR:
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    null,
                    "1 - Insertar Pelicula\n"
                    + "2 - Listat Pelicula\n"
                    + "3 - Buscar Pelicula\n"
                    + "4 - Salir",
                    "Ingrese una opción",
                    3
            );
            switch (opcion) {
                case "1":
                    String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "INGRESE EL NOMBRE DE LA PELICULA",
                            "Entrada",
                            3
                    );
                    pelicula = new Pelicula(nombrePelicula);
                    peliculas.insertarPelicula(pelicula);
                    break;
                case "2":
                    peliculas.listarPelicula();
                    break;
                case "3":
                    nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "INGRESE EL NOMBRE DE LA PELICULA",
                            "Ingrese",
                            3
                    );
                    peliculas.buscarPelicula(nombrePelicula);
                    break;
                case "4":
                    break CERRAR;
                default:
                    JOptionPane.showMessageDialog(null,
                            "OPCIÓN INCORRECTA\n"
                            + "VUEVE A IBGRESAR UNA \n"
                            + "OPCIÓN CORRECTA\n"
                            + "LAS OPCIONES SON DE 1 A 4",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE
                    );
            }
        }
    }
}