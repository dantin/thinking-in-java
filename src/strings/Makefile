JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java\
	net/mindview/util/Generator.java\
	net/mindview/util/BinaryFile.java\
	net/mindview/util/Hex.java\
	net/mindview/util/TextFile.java

sources=\
	Immutable.java\
	Concatenation.java\
	WhitherStringBuilder.java\
	UsingStringBuilder.java\
	../generics/coffee/Coffee.java\
	../generics/coffee/Latte.java\
	../generics/coffee/Mocha.java\
	../generics/coffee/Cappuccino.java\
	../generics/coffee/Americano.java\
	../generics/coffee/Breve.java\
	../generics/coffee/CoffeeGenerator.java\
	ArrayListDisplay.java\
	InfiniteRecursion.java\
	SimpleFormat.java\
	Turtle.java\
	Receipt.java\
	Conversion.java\
	DatabaseException.java\
	IntegerMatch.java\
	Splitting.java\
	Replacing.java\
	Rudolph.java\
	TestRegularExpression.java\
	Finding.java\
	Groups.java\
	StartEnd.java\
	ReFlags.java\
	SplitDemo.java\
	TheReplacements.java\
	Resetting.java\
	JGrep.java\
	SimpleRead.java\
	BetterRead.java\
	ScannerDelimiter.java\
	ThreatAnalyzer.java\
	ReplacingStringTokenizer.java

norun=\
	WhitherStringBuilder.java\
	../generics/coffee/Coffee.java\
	../generics/coffee/Latte.java\
	../generics/coffee/Mocha.java\
	../generics/coffee/Cappuccino.java\
	../generics/coffee/Americano.java\
	../generics/coffee/Breve.java\
	../generics/coffee/CoffeeGenerator.java\
	TestRegularExpression.java\
	JGrep.java

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
	java -cp $(bin) net.mindview.util.Hex bin/generics/coffee/Latte.class
	java -cp $(bin) TestRegularExpression abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}"
	java -cp $(bin) JGrep JGrep.java "\\b[Ssct]\\w+"
	@for target in $(basename $(targets));do java -cp $(bin) $$target;done
