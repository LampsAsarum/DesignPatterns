#pragma once
#include "Strategy.h"
#include "StrategyAdd.h"
#include "StrategyMultiply.h"
#include "StrategySubtract.h"

class Context
{
public:
	Context();
	Context(Strategy* strategy);
	~Context();

	void SetStrategy(Strategy* strategy);
	virtual int ExecuteStrategy(int a, int b);

private:
	Strategy* strategy_;
};

