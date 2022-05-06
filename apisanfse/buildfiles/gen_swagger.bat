REM set CLI_JAR_PATH=\progetti\oxygen\wkspc_swagger\swagger-codegen\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar
set CLI_JAR_PATH=..\lib-ext\swagger-codegen-cli.jar

set CUSTOM_GEN_JAR_PATH=..\lib-ext\csi-java-swagger-codegen-1.0.0.jar

rem set DEBUG_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,address=9797,server=y,suspend=y

java -cp %CLI_JAR_PATH%;%CUSTOM_GEN_JAR_PATH% %DEBUG_OPTS% io.swagger.codegen.SwaggerCodegen generate -i ..\src\yaml\apisanfse.yaml -l jaxrs-resteasy-eap-csi -o .. --config swagger_config_java.json

rem java -cp %CLI_JAR_PATH%;%CUSTOM_GEN_JAR_PATH% io.swagger.codegen.SwaggerCodegen config-help -l jaxrs-resteasy-eap-csi

echo
pause "#### generazione documentazione html ####"
java -jar %CLI_JAR_PATH% generate -l html -i ..\src\yaml\apisanfse.yaml -o ..\docs\yaml