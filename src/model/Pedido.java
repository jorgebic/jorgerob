package model;

	public class Pedido {
		private String nomecli;
		private String nomefil;
		private String listaitens;
		
		public Pedido(String nomecli, String nomefil, String listaitens) {
		    this.nomecli = nomecli;
		    this.nomefil = nomefil;
		    this.listaitens = listaitens;
		}

		public String getNomecli() {
			return nomecli;
		}

		public void setNomecli(String nomecli) {
			this.nomecli = nomecli;
		}

		public String getNomefil() {
			return nomefil;
		}

		public void setNomefil(String nomefil) {
			this.nomefil = nomefil;
		}
		
		
		
	}