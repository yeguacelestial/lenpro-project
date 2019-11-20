=begin
    Busqueda en Matriz
=end

#Convertir a entero
def to_int(string)
    Integer(string)
rescue ArgumentError
    nil
end

#Inicialización de variables
contador = 0

#Pedir n filas
print "Tamaño de n(filas): "
lectura = gets.chomp
n = to_int(lectura)

if (n.instance_of? Integer) == true

    if n > 0
        #Pedir m columnas
        print "Tamaño de m(columnas): "
        lectura = gets.chomp
        m = to_int(lectura)
        
        if (m.instance_of? Integer) == true
            if m > 0
                #Creacion de mateiz bidimensional
                matriz = Array.new(n){Array.new(m)}

                #Entrada de datos
                #Filas
                for ifil in 0..n-1 do
                    #Columnas
                    for icol in 0..m-1 do
                        print "Posicion[#{ifil}][#{icol}]: "
                        matriz[ifil][icol] = gets.chomp
                    end
                end

                #Impresion de indices en el arreglo
                for ifil in 0..n-1 do
                    for icol in 0..m-1 do
                        print "#{matriz[ifil][icol]}, "
                    end
                    print "\n"
                end
                print "\n"

                #Numero a comparar
                print "Elemento a buscar: "
                elemento = gets.chomp

                for ifil in 0..n-1 do
                    for icol in 0..m-1 do
                        if matriz[ifil][icol] == elemento
                            contador += 1
                        end
                    end
                end

                puts "El elemento #{elemento} aparece #{contador} veces."
                
            else
                puts "El tamaño de columnas debe ser mayor a 0."
            end
        else
            puts "Tamaño de columnas invalido."
			print "Presiona ENTER para salir."
			gets.chomp
            exit
        end

    else
        puts "El tamaño de filas debe ser mayor a 0."
		print "Presiona ENTER para salir."
		gets.chomp
        exit
    end
	print "Presiona ENTER para salir."
	gets.chomp
else
    puts "Valor de filas invalido."
	print "Presiona ENTER para salir."
	gets.chomp
    exit
end
