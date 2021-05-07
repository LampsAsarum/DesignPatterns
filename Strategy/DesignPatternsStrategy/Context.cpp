#include "Context.h"



Context::Context()
{
}


Context::Context(Strategy * strategy)
{
	strategy_ = strategy;
}

Context::~Context()
{
	strategy_ = nullptr;
}

void Context::SetStrategy(Strategy* strategy)
{
	strategy_ = strategy;
}

int Context::ExecuteStrategy(int a, int b)
{
	return strategy_->ExecuteStrategy(a, b);
}
