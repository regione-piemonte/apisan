#!/usr/bin/env bash

set -o errexit
set -o nounset
set -o pipefail

__dir="$(cd "$(dirname "${BASH_SOURCE[0]}")" && cd .. && pwd)"
BASE_PROJECT_DIR=$__dir

CLI_JAR_PATH=$BASE_PROJECT_DIR/lib-ext/swagger-codegen-cli.jar
CUSTOM_GEN_JAR_PATH=$BASE_PROJECT_DIR/lib-ext/csi-java-swagger-codegen-1.0.0.jar
YAML_PATH=$BASE_PROJECT_DIR/src/yaml/apisanassistenza.yaml
SWAGGER_CONFIG_PATH=$BASE_PROJECT_DIR/buildfiles/swagger_config_java.json
DOCUMENTATION_API=$BASE_PROJECT_DIR/docs/api
# DEBUG_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,address=9797,server=y,suspend=y

echo '****** GENERAZIONE CODICE ******'
java -cp "$CUSTOM_GEN_JAR_PATH:$CLI_JAR_PATH" io.swagger.codegen.SwaggerCodegen generate -i $YAML_PATH -l jaxrs-resteasy-eap-csi -o $BASE_PROJECT_DIR --config $SWAGGER_CONFIG_PATH

echo '****** generazione documentazione ******'
java -jar $CLI_JAR_PATH generate -l html -i $YAML_PATH -o $DOCUMENTATION_API

exit;
