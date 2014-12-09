#Gio Lapid
#1262354
#CS12B
#7-03-13
#Makefile of Extrema
JAVASRC = Extrema.java
SOURCES = README Makefile ${JAVASRC}
MAINCLASS = Extrema
CLASSES = Extrema.class
JARFILE = Extrema
JARCLASSES = ${CLASSES}
SUBMIT = submit cmps012b-pt.u13 pa1

all: ${JARFILE}

${JARFILE} : ${CLASSES}
	echo Main-class: ${MAINCLASS} > Manifest
	jar cvfm ${JARFILE} Manifest ${JARCLASSES}
	rm Manifest
	chmod +x ${JARFILE}

${CLASSES}: ${JAVASRC}
	javac -Xlint ${JAVASRC}

clean:
	rm ${CLASSES} ${JARFILE}

submit: ${SOURCES}
	${SUBMIT} ${SOURCES}

