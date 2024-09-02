
public class Carro {
	private String marca;
	private String modelo;
	private Integer velocidadeAtual;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(Integer velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public void acelerarCarro(int acelerar) {
		velocidadeAtual += acelerar;
		if (acelerar >= 100) {
			System.out.println("Oque ela te fez amigo?");
		}
	}
	public void frearCarro(int frear) {
		velocidadeAtual -= frear;
		if (velocidadeAtual == 0) {
			System.out.println("Seu carro parou");
		}
	}
	
}
