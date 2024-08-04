const DIFFICULTY = {
  NAIVE: "naive",
  EASY: "easy",
  MEDIUM: "medium",
  HARD: "hard",
  SUPERHARD: "super hard",
};

const LEVEL_OF_UNDERSTANDING = {
  NOVICE: "This is new to me and I can't figure this out yet",
  APPRENTICE: "I need more practice, I'm still confused.",
  MASTER: "I understand and can do this by myself.",
  EXPERT: "I feel confident with this. I can explain it to someone else.",
};

const LEVEL_OF_PREFERENCE = {
  HATE: "I don't want to do it again.",
  DUMB: "The question requires special trick to solve it that I think it won't appear in real interviews.",
  LIKE: "Good question.",
  LOVE: "Good question and I think it may appear in real interviews.",
  IMPORTANT:
    "Very good question, and can test a lots of knowledge in single question in real interviews.",
};

let new_ladder = {
  categories: {
    recursion: {
      lintcode: [
        {
          question_no: 771,
          difficulty: DIFFICULTY.EASY,
          first_succ_submit: true,
          level_of_understanding: LEVEL_OF_UNDERSTANDING.EXPERT,
          preference: LEVEL_OF_PREFERENCE.LIKE,
          title: "Double Factorial",
          url: "https://www.lintcode.com/course/43/learn/771?chapterId=290&sectionId=1682&ac=true",
          tags: ["dfs"],
          related_questions: [],
          ladder: [],
          note: "",
        },
      ],
      leetcode: [],
      algoexpert: [
        {
          question_no: 0,
          difficulty: "easy",
          first_succ_submit: false,
          level_of_understanding: LEVEL_OF_UNDERSTANDING.MASTER,
          preference: LEVEL_OF_PREFERENCE.DUMB,
          title: "Nth Fibonacci",
          url: "https://www.algoexpert.io/questions/nth-fibonacci",
          tags: ["dfs"],
          related_questions: ["Product Sum", "Permutations"],
          ladder: [],
          note: "",
        },
        {
          question_no: 0,
          difficulty: "easy",
          first_succ_submit: false,
          level_of_understanding: LEVEL_OF_UNDERSTANDING.MASTER,
          preference: LEVEL_OF_PREFERENCE.LOVE,
          title: "Product Sum",
          url: "https://www.algoexpert.io/questions/product-sum",
          tags: ["dfs"],
          related_questions: [],
          ladder: [],
          note: "",
        },
        {
          question_no: 0,
          difficulty: DIFFICULTY.MEDIUM,
          first_succ_submit: false,
          level_of_understanding: LEVEL_OF_UNDERSTANDING.APPRENTICE,
          preference: LEVEL_OF_PREFERENCE.LOVE,
          title: "Permutations",
          url: "https://www.algoexpert.io/questions/permutations",
          tags: ["dfs"],
          related_questions: [],
          ladder: [],
          note: "",
        },
      ],
      back_to_back: [],
    },
  },
};
