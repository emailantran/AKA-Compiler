.class public prog1
.super java/lang/Object

.field private static _sysin Ljava/util/Scanner;

;
; Runtime input scanner
;
.method static <clinit>()V

	new	java/util/Scanner
	dup
	getstatic	java/lang/System/in Ljava/io/InputStream;
	invokespecial	java/util/Scanner/<init>(Ljava/io/InputStream;)V
	putstatic	prog1/_sysin Ljava/util/Scanner;
	return

.limit locals 16
.limit stack 16
.end method

;
; Main class constructor
;
.method public <init>()V
.var 0 is this Lprog1;

	aload_0
	invokespecial	java/lang/Object/<init>()V
	return

.limit locals 16
.limit stack 16
.end method

;
; MAIN
;
.method public static main([Ljava/lang/String;)V
.var 0 is args [Ljava/lang/String;
.var 1 is _start Ljava/time/Instant;
.var 2 is _end Ljava/time/Instant;
.var 3 is _elapsed J

	invokestatic	java/time/Instant/now()Ljava/time/Instant;
	astore_1

	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"%f"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	ldc	5.1234564781188965
	ldc	3.0
	fadd
	invokestatic	java/lang/Float/valueOf(F)Ljava/lang/Float;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	invokestatic	java/time/Instant/now()Ljava/time/Instant;
	astore_2
	aload_1
	aload_2
	invokestatic	java/time/Duration/between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
	invokevirtual	java/time/Duration/toMillis()J
	lstore_3
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"\n[%,d milliseconds execution time.]\n"
	iconst_1
	anewarray	java/lang/Object
	dup
	iconst_0
	lload_3
	invokestatic	java/lang/Long/valueOf(J)Ljava/lang/Long;
	aastore
	invokevirtual	java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
	pop

	return

.limit locals 16
.limit stack 16
.end method
