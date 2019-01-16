echo "inicio de script..."
echo
echo "Ingrese la ip del servidor central: "

read ip
echo
echo "Ip ingresada: "$ip
echo
echo "Creando directorio build/web"
mkdir -p ./build/web/
echo "Directorio creado!"
echo "Copiando archivos..."
cd ./build/web
cp -r ../../web/* .
echo "Archivos copiados"
echo "Creando directorios adicionales..."
mkdir -p WEB-INF/classes
mkdir -p WEB-INF/generated-sources
mkdir -p WEB-INF/lib
cd WEB-INF/lib
echo "Copiando librerias"
cp -r ../../../../lib/* .
cd ../classes
cp -r ../../../../bootstrap-4/* .
echo "Generando servicios wsimport..."
echo "Generando ServicioU..."
wsimport -keep -Xnocompile -p servicios http://$ip:8580/ServicioU?wsdl
echo "ServicioU generado!"
echo "Generando ServicioP..."
wsimport -keep -Xnocompile -p servicios http://$ip:8680/ServicioP?wsdl
echo "ServicioP generado!"
echo "Generando ServicioC..."
wsimport -keep -Xnocompile -p servicios http://$ip:8780/ServicioC?wsdl
echo "ServicioC generado!"
cd ../../../../
echo "Compilando binarios..."
javac -cp "./lib/*" -d ./build/web/WEB-INF/classes/ ./src/java/ControladoresServlets/*.java ./build/web/WEB-INF/classes/servicios/*.java
echo "Binarios compilados!"
echo "Empaquetando..."
cd ./build/web/
jar -cvf ../culturarteWeb.war .
echo "Generado: WebCulturarte.war!"
echo "FIN!"
