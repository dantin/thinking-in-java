JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java

sources=\
	HelloDate.java\
	Precedence.java\
	Assignment.java\
	PassObject.java\
	MathOps.java\
	AutoInc.java\
	Equivalence.java\
	EqualsMethod.java\
	EqualsMethod2.java\
	Bool.java\
	ShortCircuit.java\
	Exponents.java\
	URShift.java\
	BitManipulation.java\
	TernaryIfElse.java\
	StringOperators.java

norun=

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
