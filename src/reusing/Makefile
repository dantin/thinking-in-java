JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java

sources=\
	SprinklerSystem.java\
	Bath.java\
	Detergent.java\
	Cartoon.java\
	Chess.java\
	SpaceShipControls.java\
	SpaceShip.java\
	SpaceShipDelegation.java\
	PlaceSetting.java\
	CADSystem.java\
	Hide.java\
	Lisa.java\
	Car.java\
	Orc.java\
	Wind.java\
	FinalData.java\
	BlankFinal.java\
	FinalArguments.java\
	FinalOverridingIllusion.java\
	Jurassic.java\
	Beetle.java

norun=\
	SpaceShipControls.java\
	Lisa.java

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
