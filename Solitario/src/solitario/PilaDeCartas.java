package solitario;


public interface PilaDeCartas {

	public abstract int getNumCartas();

	public abstract void barajar();

	public abstract Carta extraerCarta();

	public abstract boolean puedoAgregarCarta(Carta carta);
	
	public abstract boolean agregarCarta(Carta carta);

	public abstract boolean agregarCarta(Carta carta, boolean sinReglas);

	public abstract Carta getUltimaCarta();
	
	public abstract Carta getUltimaCarta(int numCartaDesdeElFinal);

	public abstract boolean estaVacio();

}