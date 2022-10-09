package comunicacion;

public class Alfabeto extends Pictograma{

    public static void testTesis() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	private String[] letras;
	private String interpretacion;
	
	
	//constructores
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	//metodos
	public int cantidadLetras() {
		return this.getLetras().length;
	}
        @Override
	public String interpretacion() {
		return this.getInterpretacion();
	}
        @Override
	public String toString() {
		String cadena="";
		for(String i : letras) {
                    if (letras[letras.length-1].equals(i)) {
                        cadena+=i;
                    } 
                    else {
                        cadena+=i+", ";
                    }
                     
		}
		return cadena;
	}
	
	//getters y setters
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	   
}
