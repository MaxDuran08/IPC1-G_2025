Algoritmo ejemplo
	Definir cuenta, contraseņa Como Cadena
	Definir saldo, monto Como Real
	saldo <- 60
	Escribir "Ingrese su numero de cuenta:"
	Leer cuenta
	Escribir "Ingrese su contraseņa"
	Leer contraseņa
	
	Si cuenta="123" Y contraseņa="abc" Entonces
		Escribir "Ingrese el monto a retirar"
		Leer monto
		
		si monto<=saldo Entonces
			saldo <- saldo -monto
			Escribir "Restire su dinero"
			Escribir "Su saldo restante es: ", saldo
		SiNo
			Escribir "Saldo insuficiente"
		FinSi
		
		
	SiNo
		Escribir "Datos incorrectos"
	FinSi
	
FinAlgoritmo
