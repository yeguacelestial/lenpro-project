=begin
Multiplicacion de matrices
=end

#Convertir a entero
def to_int(string)
    Integer(string)
rescue ArgumentError
    nil
end

#Preguntar por el tamaño de las matrices
print "M1 - Filas (n1): "
lect = gets.chomp
n1 = to_int(lect)
print "M1 - Columnas (m1): "
lect = gets.chomp
m1 = to_int(lect)
print "M2 - Filas (n2): "
lect = gets.chomp
n2 = to_int(lect)
print "M2 - Columnas (m2): "
lect = gets.chomp
m2 = to_int(lect)

#Si el numero de columnas de M1 es igual al numero de filas de M2
if m1 == n2
    matriz1 = Array.new(n1){Array.new(m1)}
    matriz2 = Array.new(n2){Array.new(m2)}
    matriz_resultante = Array.new(n1){Array.new(m2)}

    #Secuencia iterativa de entrada
    #MATRIZ 1
    #Filas
    for i in 0..n1-1 do
        #Columnas
        for j in 0..m1-1 do
            print "M1 - Posicion[#{i}][#{j}]: "
            lect = gets.chomp
            matriz1[i][j] = to_int(lect)
        end
    end

    #MATRIZ 2
    #Filas
    for i in 0..n2-1 do
        #Columnas
        for j in 0..m2-1 do
            print "M2 - Posicion[#{i}][#{j}]: "
            lect = gets.chomp
            matriz2[i][j] = to_int(lect)
        end
    end

    #MATRIZ RESULTANTE
    for ir in 0..n1-1 do
        for jr in 0..m2-1 do
            matriz_resultante[ir][jr] = 0
            for k in 0..m1-1 do
                matriz_resultante[ir][jr] += matriz1[ir][k] * matriz2[k][jr]
            end
        end
    end

    #Impresion de matrices

    #Matriz 1
    puts "MATRIZ 1"
    for i in 0..n1-1 do
        for j in 0..m1-1 do
            print "#{matriz1[i][j]} "
        end
        puts " "
    end
    puts " "

    #Matriz 2
    puts "MATRIZ 2"
    for i in 0..n2-1 do
        for j in 0..m2-1 do
            print "#{matriz2[i][j]} "
        end
        puts " "
    end
    puts " "

    #Matriz resultante
    puts "MATRIZ RESULTANTE: "
    for i in 0..n1-1 do
        for j in 0..m2-1 do
            print "#{matriz_resultante[i][j]} "
        end
        puts " "
    end
    
else
    puts "Error: m1 debe ser igual a n2."
end