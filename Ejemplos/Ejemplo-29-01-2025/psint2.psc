Algoritmo ejemplo
	Definir cuenta, contrase�a Como Cadena
	Definir saldo, monto Como Real
	saldo <- 60
	Escribir "Ingrese su numero de cuenta:"
	Leer cuenta
	Escribir "Ingrese su contrase�a"
	Leer contrase�a
	
	Si cuenta="123" Y contrase�a="abc" Entonces
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
