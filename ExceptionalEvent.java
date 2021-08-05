class ExceptionalEvent
{
	
void throwableEvent() throws Throwable
{
	Throwable throwable=new Throwable();
	throw throwable;
}

void exceptionEvent()throws Exception
{
	Exception exception=new Exception();
	throw exception;
}
void errorEvent()
{
	Error error=new Error();
	throw error;
}
void runTimeExceptionEvent()
{
	RuntimeException runTimeException=new RuntimeException();
	throw runTimeException;
}
}