func twoSum(nums []int, target int) []int {
    mp := make(map[int]int)

    for i,num := range nums{
        res  := target - num
        if index,exists := mp[res]; exists{
            return []int{index,i}
        }

        mp[num]=i
    }
    return []int{}
}