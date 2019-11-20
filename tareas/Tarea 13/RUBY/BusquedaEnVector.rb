#BUSQUEDA EN VECTOR

#Convertir a entero
def to_int(string)
    Integer(string)
rescue ArgumentError
    nil
end

#Contador
cont = 0

print "Tamaño del arreglo: "
lectura = gets.chomp

tamaño = to_int(lectura)

if (tamaño.instance_of? Integer) == true
    if tamaño < 0 or tamaño == 0
        puts "#{tamaño} no es un tamaño valido."
		puts "Presiona ENTER para salir."
		gets.chomp
        exit
    else
        vector = Array.new(tamaño)
        puts "El tamaño es de #{vector.size}"

        #Secuencia iterativa para indices en el vector
        for i in 0..vector.size-1 do
            print "Posicion[#{i}]: "
            pos = gets.chomp
            vector[i] = pos
        end

        #Busqueda del numero
        #Lectura
        print "Valor a buscar: "
        valor = gets.chomp

        #Recorrer vector
        for i in 0..vector.size-1 do
            if valor == vector[i]
                cont = cont + 1
            end
        end

        #Impresion
        puts "El numero #{valor} aparece #{cont} veces."
		puts "Presiona ENTER para salir."
		gets.chomp

    end

else
    puts "Valor invalido."
	puts "Presiona ENTER para salir."
	gets.chomp
end