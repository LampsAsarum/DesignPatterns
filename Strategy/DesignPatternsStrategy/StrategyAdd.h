#pragma once

#include "Strategy.h"

class StrategyAdd : public Strategy
{
public:
	StrategyAdd();
	virtual ~StrategyAdd();

	virtual int ExecuteStrategy(int a, int b);
};

