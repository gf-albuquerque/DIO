using DesafioPOO.Models;

Nokia nokia = new Nokia("123456789", "Nokia 3310", "123456789012345", 16);
Console.WriteLine($"Modelo: {nokia.Modelo}, Numero: {nokia.Numero}, IMEI: {nokia.IMEI}, Memória: {nokia.Memoria}GB");
nokia.Ligar();
nokia.ReceberLigacao();
nokia.InstalarAplicativo("Snake");

Console.WriteLine("\n");

Iphone iphone = new Iphone("987654321", "iPhone 13", "987654321098765", 128);
Console.WriteLine($"Modelo: {iphone.Modelo}, Numero: {iphone.Numero}, IMEI: {iphone.IMEI}, Memória: {iphone.Memoria}GB");
iphone.Ligar();
iphone.ReceberLigacao();
iphone.InstalarAplicativo("Instagram");

Console.WriteLine("\n");

