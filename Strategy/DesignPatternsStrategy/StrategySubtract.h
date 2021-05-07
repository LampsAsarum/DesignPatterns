#pragma once

#include "Strategy.h"

class StrategySubtract : public Strategy
{
public:
	StrategySubtract();
	virtual ~StrategySubtract();

	virtual int ExecuteStrategy(int a, int b);
};

