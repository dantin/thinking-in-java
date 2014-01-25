JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java

sources=\
	../polymorphism/music/Note.java\
	music4/Music4.java\
	music5/Music5.java\
	classprocessor/Apply.java\
	filters/Waveform.java\
	filters/Filter.java\
	filters/LowPass.java\
	filters/HighPass.java\
	filters/BandPass.java\
	interfaceprocessor/Processor.java\
	interfaceprocessor/Apply.java\
	interfaceprocessor/StringProcessor.java\
	interfaceprocessor/FilterProcessor.java\
	Adventure.java\
	HorrorShow.java\
	InterfaceCollision.java\
	RandomWords.java\
	RandomDoubles.java\
	AdaptedRandomDoubles.java\
	Months.java\
	RandVals.java\
	TestRandVals.java\
	nesting/NestingInterfaces.java\
	Factories.java\
	Games.java

norun=\
	../polymorphism/music/Note.java\
	filters/Waveform.java\
	filters/Filter.java\
	filters/LowPass.java\
	filters/HighPass.java\
	filters/BandPass.java\
	interfaceprocessor/Processor.java\
	interfaceprocessor/Apply.java\
	InterfaceCollision.java\
	Months.java\
	RandVals.java

targets := $(filter-out $(norun:.java=.class), $(sources:.java=.class))

build: init util $(sources:.java=.class)

util: $(addprefix $(util-path), $(utils:.java=.class))

%.class: %.java
	$(JAVAC) $(JFLAGS) -cp $(bin) -d $(bin) $<

.PHONY: clean test init
init:
	mkdir -p $(bin)

clean:
	-rm -rf $(bin) *.class *~

test: build
	@for target in $(basename $(targets));do java -cp $(bin) $$target;done
