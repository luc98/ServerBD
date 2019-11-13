package com.example.handlingformsubmission;

public class usuario {
			private String usuario;
			private String pass;
			
			/*
			private String Nombre;
			private String Email;
			private String Apellido;
			
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getApellido() {
				return apellido;
			}
			public void setApellido(String apellido) {
				this.apellido = apellido;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			*/
			public String getUsuario() {
				return usuario;
			}
			public void setUsuario(String usuario) {
				this.usuario = usuario;
			}
			public String getPass() {
				return pass;
			}
			public void setPass(String pass) {
				this.pass = pass;
			}
			public usuario() {}
			public usuario(String usuario, String pass) {
				this.usuario=usuario;
				this.pass=pass;
			}
}
