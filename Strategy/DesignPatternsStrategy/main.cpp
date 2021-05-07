#include <iostream>
#include "Context.h"

int main()
{
	Context* context_add = new Context(new StrategyAdd);
	std::cout << context_add->ExecuteStrategy(1, 2) << std::endl;

	Context* context_multiply = new Context(new StrategyMultiply);
	std::cout << context_multiply->ExecuteStrategy(1, 2) << std::endl;

	Context* context_subtract = new Context(new StrategySubtract);
	std::cout << context_subtract->ExecuteStrategy(1, 2) << std::endl;

	return 0;
}