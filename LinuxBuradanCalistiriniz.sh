#!/bin/bash

function dev_define {
	tput setaf 5;
        echo ""
        echo "*******************************************"
        echo "* This script written by @keraattin       *"
        echo "*                  powered by Java        *"
        echo "*******************************************"
        echo ""
	tput sgr0;
}

function thank_you {
	tput setaf 5;
	echo ""
        echo "*******************************************"
        echo "* Thank you for executing @keraattin      *"
        echo "*                         see you...      *"
        echo "*******************************************"
        echo ""
	tput sgr 0;
}

dev_define

tput setaf 2;
java -jar executableJava.jar

while echo "Tekrar calistirmak icin Y programı sonlandırmak icin N ye basiniz : "
read secim
do
if [ $secim == 'Y' ]
then
	clear
	java -jar executableJava.jar
fi
if [ $secim == 'N' ]
then
	thank_you
	exit
fi
done

tput sgr0;
