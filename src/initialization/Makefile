JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java
#	net/mindview/util/Range.java

sources=\
	SimpleConstructor.java\
	SimpleConstructor2.java\
	Overloading.java\
	OverloadingOrder.java\
	PrimitiveOverloading.java\
	Demotion.java\
	DefaultConstructor.java\
	NoSynthesis.java\
	BananaPeel.java\
	Apricot.java\
	Leaf.java\
	PassingThis.java\
	Flower.java\
	TerminationCondition.java\
	InitialValues.java\
	InitialValues2.java\
	Measurement.java\
	MethodInit.java\
	MethodInit2.java\
	MethodInit3.java\
	Counter.java\
	OrderOfInitialization.java\
	StaticInitialization.java\
	Spoon.java\
	ExplicitStatic.java\
	Mugs.java\
	ArraysOfPrimitives.java\
	ArrayNew.java\
	ArrayClassObj.java\
	ArrayInit.java\
	DynamicArray.java\
	VarArgs.java\
	NewVarArgs.java\
	OptionalTrailingArguments.java\
	VarargType.java\
	AutoboxingVarargs.java\
	OverloadingVarargs.java\
	OverloadingVarargs2.java\
	OverloadingVarargs3.java\
	Spiciness.java\
	SimpleEnumUse.java\
	EnumOrder.java\
	Burrito.java

norun=\
	Apricot.java\
	InitialValues2.java\
	Measurement.java\
	MethodInit.java\
	MethodInit2.java\
	MethodInit3.java\
	Counter.java\
	Spoon.java\
	Spiciness.java

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
