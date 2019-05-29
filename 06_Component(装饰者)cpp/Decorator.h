#pragma once
class Component
{
public:
	virtual ~Component();
	virtual void Operation();
	Component();
private:
};

class ConcreteComponent :public Component
{
public:
	ConcreteComponent();
	~ConcreteComponent();
	void Operation()
	{
		std::cout << "ConcreteComponent operation..." << std::endl;
	}
private:
};
class Decorator :public Component
{
public:
	virtual ~Decorator();
	Decorator(Component* com)
	{
		this->_com = com;
	}
	virtual~Decorator()
	{
		delete _com;
	}
	void Operation();
	Component* _com;
private:
};
class ConcreteDecorator :public Decorator
{
public:
	ConcreteDecorator(Component* com);
	~ConcreteDecorator();
	void AddedBehavior()
	{
		std::cout << "ConcreteDecorator::AddedBehacior...." << std::endl;
	}
	void Operation()
	{
		_com->Operation();
		this->AddedBehavior();
	}
private:
};