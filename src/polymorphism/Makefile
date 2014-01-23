JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java

sources=\
	music/Note.java\
	music/Instrument.java\
	music/Wind.java\
	music/Music.java\
	music/Music2.java\
	shape/Shape.java\
	shape/Circle.java\
	shape/Square.java\
	shape/Triangle.java\
	shape/RandomShapeGenerator.java\
	Shapes.java\
	music3/Music3.java\
	PrivateOverride.java\
	FieldAccess.java\
	StaticPolymorphism.java\
	Sandwich.java\
	Frog.java\
	ReferenceCounting.java\
	PolyConstructors.java\
	CovariantReturn.java\
	Transmogrify.java\
	RTTI.java

norun=\
	music/Note.java\
	music/Instrument.java\
	music/Wind.java\
	shape/Shape.java\
	shape/Circle.java\
	shape/Square.java\
	shape/Triangle.java\
	shape/RandomShapeGenerator.java


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
