# Componente di Prodotto

APISANASSISTENZA

## Versione

1.0.0

## Descrizione del prodotto

Si tratta di API di orchestrazione rivolte al cittadino tra il front end, realizzato tramite il prodotto SANSOL pubblicato [qui](https://github.com/regione-piemonte/sansol), e i servizi di business di CRM 

## Configurazioni iniziali

I servizi "orchestrati" si trovano ai seguenti link [SERVIZI SOAP](docs/wsdl) gli script per l'inizializzazione del database sotto la cartella [SCRIPT](docs/sql). E' necessario che il file di [properties](buildfiles/prod.properties) sia configurato affinchè punti a dei servizi mock generati secondo tali descrittori.

Lanciare il comando ant -DSECRET_PWD=xxx -Dvalue=mypass encrypt per generare la #password di cifratura  dovrà andare a sostituire il valore di encryptionkey sul  [file](buildfiles/prod.properties).

## Prerequisiti di sistema

Java:
Jdk 1.8

ANT:
Ant version 1.9.6

Server Web:
Apache 2.4.6

Application Server:
JBoss eap 6.4.5

Tipo di database:
postgres v12

## Installazione

lanciare il comando ant -Dtarget prod -DSECRET_PWD[password](#password) per generare l'ear

## Deployment

Inserire il file ear generato durante l'installazione sotto la cartella deployments del Jboss

## Versioning

Per il versionamento del software si usa la tecnica Semantic Versioning (http://semver.org).

## Authors

* [Paolo Manca](https://github.com/pmancacsi)

## Copyrights

“© Copyright Regione Piemonte – 2022”
