def to_float(string)
    Float(string)
rescue ArgumentError
    nil
end

puts "CONVERSOR DE TEMPERATURA"
puts "MENU:
    (1) °C => °F
    (2) °F => °C"
print "Opcion: "
opcion = gets.chomp

if opcion == '1'
    texto = "°C => °F"
    puts "Escogiste: " + texto

    print "°C:"
    entrada = gets.chomp
    temp_c = to_float(entrada)

    if temp_c
        conv_c_to_f = (temp_c * 1.8) + 32
        conv_c_to_f.to_f
        puts "#{temp_c}°C => #{conv_c_to_f}°F"
    else
        puts "Valor invalido."
    end

elsif opcion == '2'
    texto = "F => °C"
    puts "Escogiste: " + texto

    print "°F: "
    entrada = gets.chomp
    temp_f = to_float(entrada)

    if temp_f
        conv_f_to_c = (temp_f - 32) / 1.8
        conv_f_to_c.to_f
        puts "#{temp_f}°F => #{conv_f_to_c}°C"
        
    else
        puts "Valor invalido."
    end
    
else
    puts "Opcion invalida."
end
puts "Presiona ENTER para salir."
gets.chomp