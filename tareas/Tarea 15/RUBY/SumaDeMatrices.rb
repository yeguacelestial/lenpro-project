=begin
    Suma de matrices
=end

#Metodo para convertir a entero
def to_int(string)
    Integer(string)
rescue ArgumentError
    nil
end

#Inicializacion de variables
i = 0
j = 0

#Pedir filas
print "Valor de n(filas): "
lect = gets.chomp
n = to_int(lect)

if (n.instance_of? Integer) == true
    if n == 0 or n < 0
        puts "El valor de filas debe ser mayor a 0."

    else
        #Pedir columnas
        print "Valor de m(columnas): "
        lect = gets.chomp
        m = to_int(lect)

        if (m.instance_of? Integer) == true
            if m == 0 or m < 0
                puts "El valor de las columnas debe ser mayor a 0."
				puts "Presiona ENTER para salir."
				gets.chomp
            else
                #MATRICES
                matriz1 = Array.new(n){Array.new(m)}
                matriz2 = Array.new(n){Array.new(m)}
                matriz_suma = Array.new(n){Array.new(m)}

                #Captura de valores
                #Matriz 1
                for i in 0..n-1 do
                    for j in 0..m-1 do
                        print "M1 - Posicion[#{i}][#{j}]: "
                        lectura = gets.chomp
                        matriz1[i][j] = to_int(lectura)
                    end
                end

                #Matriz 2
                for i in 0..n-1 do
                    for j in 0..m-1 do
                        print "M2 - Posicion[#{i}][#{j}]: "
                        lectura = gets.chomp
                        matriz2[i][j] = to_int(lectura)
                    end
                end

                #Suma de matriz1+matriz2
                for i in 0..n-1 do
                    for j in 0..m-1 do
                        matriz_suma[i][j] = matriz1[i][j] + matriz2[i][j]
                    end
                end

                #Impresion de matrices y suma
                puts "**RESULTADOS**"
                #Matriz 1
                puts "MATRIZ 1: "
                for i in 0..n-1 do
                    for j in 0..m-1 do
                        print "#{matriz1[i][j]} "
                    end
                    puts " "
                end
                puts "\n"

                #Matriz 2
                puts "MATRIZ 2: "
                for i in 0..n-1 do
                    for j in 0..m-1 do
                        print "#{matriz2[i][j]} "
                    end
                    puts " "
                end
                puts "\n"

                #Matriz suma
                puts "SUMA DE AMBAS MATRICES: "
                for i in 0..n-1 do
                    for j in 0..m-1 do
                        print "#{matriz_suma[i][j]} "
                    end
                    puts " "
                end
            end
			puts "Presiona ENTER para salir."
			gets.chomp

        else
            puts "Valor de columnas invalido."
			puts "Presiona ENTER para salir."
			gets.chomp
        end

    end

else
    puts "Valor de filas invalido."
end