# Componente di Prodotto

APISANCROSS

## Versione

1.4.1

## Descrizione del prodotto

Si tratta di API di orchestrazione rivolte al cittadino tra il front end, realizzato tramite il prodotto SANSOL pubblicato [qui](https://github.com/regione-piemonte/sansol), e i servizi di business di samrtdatanet e loccsi.

## Configurazioni iniziali

I servizi "orchestrati" si trovano ai seguenti link [SERVIZI SOAP](docs/wsdl) [SERVIZI REST](docs/xml)(docs/yaml)  E' necessario che il file di [properties](buildfiles/prod.properties) sia configurato affinchè punti a dei servizi mock generati secondo tali descrittori.

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

lanciare il comando ant -Dtarget prod per generare l'ear

## Deployment

Inserire il file ear generato durante l'installazione sotto la cartella deployments del Jboss

## Versioning

Per il versionamento del software si usa la tecnica Semantic Versioning (http://semver.org).

## Authors

* [Domenico Lisi](https://github.com/hefrety?tab=stars)
* [Egidio Bosio](https://github.com/egidio-bosio)

## Copyrights

“© Copyright Regione Piemonte – 2022”
