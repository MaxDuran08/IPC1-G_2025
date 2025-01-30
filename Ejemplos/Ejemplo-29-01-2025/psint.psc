Algoritmo Ejemplo
	Definir cuenta, CONTRASENA Como Cadena
	Definir saldo, monto Como Real
	saldo <- 1000
	Escribir 'Ingrese número de cuenta: ' // Saldo inicial de ejemplo
	Leer cuenta
	Escribir 'Ingrese contraseña: '
	Leer CONTRASENA
	// Verificación de credenciales (simulada con valores fijos)
	Si cuenta='123456' Y CONTRASENA='abc123' Entonces
		Escribir 'Ingrese monto a retirar: '
		Leer monto
		Si monto<=saldo Entonces
			saldo <- saldo-monto
			Escribir 'Retire su dinero'
			Escribir 'Saldo restante: ', saldo
		SiNo
			Escribir 'Saldo insuficiente'
		FinSi
	SiNo
		Escribir 'Datos incorrectos'
	FinSi
FinAlgoritmo
