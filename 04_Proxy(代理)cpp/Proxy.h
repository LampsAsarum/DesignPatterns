#pragma once
class Subject
{
public:
	Subject();
	virtual ~Subject();
	virtual void Request() = 0;
private:
};

class ConcreteSubject :public Subject
{
public:
	ConcreteSubject();
	~ConcreteSubject();
	void Request();
private:
};

class Proxy
{
public:
	Proxy();
	Proxy(Subject* sub);
	~Proxy();
	void Request();
private:
	Subject* _sub;
};