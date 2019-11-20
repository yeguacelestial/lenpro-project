def to_float(string)
    Float(string)
rescue ArgumentError
    nil
end

puts "CONVERSION DE MONEDAS
        (1) Dolar
        (2) Euro
        (3) Yen (Japones)
        (4) Dolar de Hong Kong"

puts "Opcion: "
opcion = gets.chomp

if opcion == '1'
    texto = 'Dolar'
    puts "Escogiste: " + texto
    print "$MXN: "
    entrada = gets.chomp
    mxn = to_float(entrada)

    if mxn
        conv_to_dolar = 0.051 * mxn
        conv_to_dolar.to_f
        puts "#{mxn}$ MXN => #{conv_to_dolar}$ Dolares"
    else
        puts "Valor invalido."
    end

elsif opcion == '2'
    texto = 'Euro'
    puts "Escogiste: " + texto

    print "$MXN: "
    entrada = gets.chomp
    mxn = to_float(entrada)

    if mxn
        conv_to_euro = 0.047 * mxn
        conv_to_euro.to_f
        puts "#{mxn}$ MXN => #{conv_to_euro}$ Euros"
    else
        puts "Valor invalido."
    end

elsif opcion == '3'
    texto = 'Yen (Japones)'
    puts "Escogiste: " + texto

    print "$MXN: "
    entrada = gets.chomp
    mxn = to_float(entrada)

    if mxn
        conv_to_yen = 5.53 * mxn
        conv_to_yen.to_f
        puts "#{mxn}$ MXN => #{conv_to_yen}$ Yenes"
    else
        puts "Valor invalido."
    end

elsif opcion == '4'
    texto = 'Dolar de Hong Kong'
    puts "Escogiste: " + texto

    print "$MXN: "
    entrada = gets.chomp
    mxn = to_float(entrada)

    if mxn
        conv_to_dhk = 0.40 * mxn
        conv_to_dhk.to_f
        puts "#{mxn}$ MXN => #{conv_to_dhk}$ Dolares Hongkonenses"
    else
        puts "Valor invalido."
    end

else
    puts "Opcion invalida."
end

puts "Presiona ENTER para salir."
gets.chomp
